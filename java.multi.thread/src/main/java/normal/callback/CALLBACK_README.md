## Callback 정의  (https://cafe.naver.com/devctrl.cafe?iframe_url=/ArticleRead.nhn%3Farticleid=1727)

	프로그래밍에서 콜백(callback)은 다른 코드의 인수로서 넘겨받는 서브루틴이다. 
	이를 통해 높은 수준의 층에 정의된 서브루틴(또는 함수)을 낮은 수준의 추상화층이 호출할 수 있게 된다. 
	일반적으로 먼저 높은 수준의 코드가 낮은 수준의 코드에 있는 함수를 호출할 때, 다른 함수의 포인터나 핸들을 넘겨준다. 
	
	낮은 수준의 함수를 실행하는 동안에 그 넘겨받은 함수를 적당히 회수, 호출하고, 부분 작업을 실행하는 경우도 있다. 
	다른 방식으로는 낮은 수준의 함수는 넘겨받은 함수를 '핸들러'로서 등록하고, 
	낮은 수준의 층에서 비동기적으로(어떠한 반응의 일부로서) 다음에 호출하는데 사용한다. 
	콜백은 폴리모피즘과 제네릭프로그래밍의 단순화된 대체 수법이며, 
	어떤 함수의 정확한 동작은 그 낮은 수준의 함수에 넘겨주는 함수 포인터(핸들러)에 의해 바뀐다. 
	이것은 코드 재사용을 하는 매우 강력한 기법이라고 말할 수 있다.


위의 정의에서 보듯 callback은 포인터나 핸들러를 넘겨줘서 피호출자(Callee)가 호출자(Caller)를 호출하는 기법으로 코드 재상용이 가능하고, 
비동기적으로 처리할 수 있으며 함수를 추상화 할 수 있기 때문에 UI나 비동기 처리 시스템에서 callback 기법을 많이 사용한다.

