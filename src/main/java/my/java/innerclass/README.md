# Inner Class
## 정의
- Inner Class란 Class의 내부에 정의된 또다른 Class를 의미한다.
- Inner Class는 바로 접근하여 생성할 수 없으며 상위 클래스를 통해서만 접근할 수 있다.

## 장점
- 긴밀한 관계를 갖는 클래스를 한 데 묶어 캡슐화를 증진시킨다.

## 종류 
### Member Inner Class
#### 사용
- OuterClass의 인스턴스를 통해 생성할 수 있다.
```java
OuterClass outerClass = new OuterClass();
OuterClass.InnerClass innerClass = outerClass.new InnerClass();
``` 
### Static Inner Class
#### 사용
- OuterClass로 바로 접근하여 생성할 수 있다.
```java
OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();

```

### Anonymous Inner Class
- 사용시 구현을 재정의하여 사용할 수 있다.
```java
OuterClass outerClass = new OuterClass() {
    @Override public String getName() {
        return "Anonymous Inner Class";
    }
};
```