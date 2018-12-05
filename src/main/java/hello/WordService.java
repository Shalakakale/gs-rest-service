package hello;

import org.springframework.stereotype.Service;

@Service
public class WordService {
    
	static final int NO_OF_CHARS = 256; 
	
	/**
	 * 
	 * @param word
	 * @return
	 */
	public boolean isPalindromeWord(String word) {
		String revStr = "";
		for(int i = word.length()-1; i>=0; i--) {
			revStr= revStr + word.charAt(i);
		}
		if(word.equals(revStr)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public boolean isAnagramOfPalindrome(String str) {
		// Create a count array and initialize 
        // all values as 0 
        int[] count = new int[NO_OF_CHARS]; 
  
        // For each character in input strings, 
        // increment count in the corresponding 
        // count array 
        for (int i = 0; i < str.length(); i++) 
            count[str.charAt(i)]++; 
  
        // Count odd occurring characters 
        int odd = 0; 
        for (int i = 0; i < NO_OF_CHARS; i++) { 
            if ((count[i] & 1) != 0) 
                odd++; 
  
            if (odd > 1) 
                return false; 
        } 
  
        // Return true if odd count is 0 or 1, 
        return true; 
	}
	
	public ResponseDto getResponseDto(final String word) {
		ResponseDto responseDto = new ResponseDto();
		responseDto.setWord(word);
		responseDto.setPalindrome(isPalindromeWord(word));
		responseDto.setAnagramOfPalindrome(isAnagramOfPalindrome(word));
		return responseDto;
		
	}
}
