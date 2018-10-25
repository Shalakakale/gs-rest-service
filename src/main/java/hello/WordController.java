package hello;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
	@Autowired
	public WordService wordService;
    
	@RequestMapping(value = "/words/{word}", method = RequestMethod.GET)
	public ResponseDto getResponse(@PathVariable("words") String words) {
		return wordService.getResponseDto(words);
	}
	
	
}
