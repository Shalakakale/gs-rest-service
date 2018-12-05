package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
	@Autowired
	public WordService wordService;
    
	@RequestMapping(value = "/words/{word}", method = RequestMethod.GET)
	public ResponseDto getResponse(@PathVariable("word") String words) {
		return wordService.getResponseDto(words);
	}
	
	
}
