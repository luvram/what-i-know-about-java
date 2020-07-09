# Exception

## Checked Exception 과 Unchecked Exception
### Checked Exception
- Unchecked Exception 을 제외한 모든 Exception 을 Checked Exception 이라 부른다.
- 컴파일 시점에서 예외 발생 여부를 체크해준다. 
- 반드시 `try-catch` 혹은 `throws` 로 예외를 처리해주어야 한다. 

### Unchecked Exception
- 애플리케이션 실행 도중 발생하는 Exception 을 의미하며 Error 와 Runtime Exception 가 있다.
- 컴파일 시점에 예외 발생 여부를 알 수 없으며, 따라서 `try-catch` 혹은 `throws`와 같은 예외처리를 강제하지 않는다.
 
### 어떻게 써야 할까?
- 복구 가능한(처리 가능한) 예외라면, 혹은 반드시 처리되어야 하는 에러라면 Checked Exception 으로 정의하여 사용한다.
- 복구할 수 없는 예외거나 선택적으로 복구 여부를 결정하고 싶다면 Unchecked Exception 을 사용한다.

## Nested Exception (중첩 예외)
- 발생한 예외를 다른 예외로 한번 더 감싼 중첩 예외를 의미한다.
- `catch` 문에서 예외를 처리하지 않고 다른 예외로 변환하여 다시 `throw` 하는 방식으로 Nested Exception을 만들 수 있다.
- 다른 타입의 여러 예외를 하나의 예외로 추상화 하는데 사용되거나, 의미가 불분명한 예외를 이해하기 쉬운 타입의 에러로 변환하는데 사용된다.
