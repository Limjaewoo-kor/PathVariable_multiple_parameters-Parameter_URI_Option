# studySpringMvc

## Mapping 어노테이션

@GetMapping <br/>
@PostMapping <br/>
@PutMapping <br/>
@DeleteMapping <br/>
@PatchMapping <br/>


- PathVariable 다중 사용법
  -> "/mapping/users/{userId}/orders/{orderId}"


- 매핑시 특정 조건 추가하여 매핑하는법 
- 파라미터로 추가 매핑 
  ->  params = "mode=debug"
- 특정 헤더로 추가 매핑 
  -> headers = "mode=debug"
- Content-Type 헤더 기반 추가 매핑 Media Type 
  ->  consumes = "application/json"
- Accept 헤더 기반 Media Type 
  -> produces = "text/html"
