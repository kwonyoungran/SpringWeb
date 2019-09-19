package com.haenandong.webservice.naverlogin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class NaverloginSample {
	
	//naberlogin test
	@SuppressWarnings("unused")
	@GetMapping("/navercallback")
	public ModelAndView navercallback(HttpServletRequest request) throws UnsupportedEncodingException {
		Map<String,Object> userInfo = null;
		String clientId = "1J4PhQC56FaH4Px9L3ny";//애플리케이션 클라이언트 아이디값";
		String clientSecret = "TkYeC1T_DL";//애플리케이션 클라이언트 시크릿값";
		String code = request.getParameter("code");
		String state = request.getParameter("state");
		String redirectURI = URLEncoder.encode("http://106.255.226.146:83/navercallback", "UTF-8");
		String apiURL;
		apiURL = "https://nid.naver.com/oauth2.0/token?grant_type=authorization_code&";
		apiURL += "client_id=" + clientId;
		apiURL += "&client_secret=" + clientSecret;
		apiURL += "&redirect_uri=" + redirectURI;
		apiURL += "&code=" + code;
		apiURL += "&state=" + state;
		String access_token = "";
		String refresh_token = "";
//		System.out.println("apiURL=" + apiURL);
		try {
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			int responseCode = con.getResponseCode();
			BufferedReader br;
			System.out.print("responseCode=" + responseCode);
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			if (responseCode == 200) {
				System.out.println(response.toString());
				//{"access_token":"AAAANuxccUu2A2c86iV3v_zJvtRSe9QsQzd2GiiZw8iFwOPI4icUU3hxBl4yHEkTlncuKUJ1KhSiuu9fCJYvvbDdHXI","refresh_token":"NQWUd9os5NuxjiiYQLvIVzKbsNkrH50D1ubBV8TWg1isAsmRnfrHhw0eTIWSfaRMVIL0QlkGWQCVVwGDzTVIe5W5dUii5r5ezrxy9VM3vpZayLzbSip6yFDPyfVsiimNUmuVh","token_type":"bearer","expires_in":"3600"}
				String JsonString = response.toString();
				ObjectMapper mapper = new ObjectMapper();
				Map<String,Object> map = new HashMap<String, Object>();
				map = mapper.readValue(JsonString, new TypeReference<Map<String, Object>>(){});
				userInfo = APIExamMemberProfile(map);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		ModelAndView mav = new ModelAndView("/naverlogin/result");
		mav.addObject("userInfo", userInfo);
		
		return mav;
	}
	
    public static Map<String,Object> APIExamMemberProfile (Map<String,Object> map) {
    	Map<String,Object> returnMap = new HashMap<String, Object>();
        String token = String.valueOf(map.get("access_token"));// 네이버 로그인 접근 토큰;
        String header = "Bearer " + token; // Bearer 다음에 공백 추가
        try {
            String apiURL = "https://openapi.naver.com/v1/nid/me";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", header);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            System.out.println(response.toString());
            
            String JsonString = response.toString();
			ObjectMapper mapper = new ObjectMapper();
			returnMap = new HashMap<String, Object>();
			returnMap = mapper.readValue(JsonString, new TypeReference<Map<String, Object>>(){});

        } catch (Exception e) {
            System.out.println(e);
        }
        
        return returnMap;
        //{"resultcode":"00","message":"success","response":{"id":"3984398","nickname":"ho****","profile_image":"https:\/\/ssl.pstatic.net\/static\/pwe\/address\/img_profile.png","age":"30-39","gender":"F","email":"horany83@gmail.com","name":"\uad8c\uc601\ub780","birthday":"03-08"}}

    }
}
