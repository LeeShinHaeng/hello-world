import React, { useEffect, useReducer } from 'react';

// 2. 리듀서 정의
function reducer(state, action) {
  switch (action.type) {
    case "SET_NAME":
      return { ...state, name: action.payload };
    case "SET_EMAIL":
      return { ...state, email: action.payload };
    case "RESET":
      return { name: '', email: '' };
    default:
      return state;
  }
}

const FormHandler = () => {
  const [state, dispatch] = useReducer(reducer, { name: '', email: '' });

  // 1. useEffect 사용
  useEffect(() => {
    console.log("입력값이 변경되었습니다:", state);
  }, [state]);

  // 1. 입력값 변경 
  const handleChange = (e) => {
    const { name, value } = e.target;
    if (name === "name") {
      dispatch({ type: "SET_NAME", payload: value });
    } else if (name === "email") {
      dispatch({ type: "SET_EMAIL", payload: value });
    }
  };

  // 4. 마운트 시 콘솔 출력
  useEffect(() => {
    console.log("데이터 로딩 중...");
    const timer = setTimeout(() => {
      console.log("데이터 로딩 완료");
    }, 2000);

    return () => clearTimeout(timer);
  }, []);

  // 3. 초기화버튼 핸들러
  const handleReset = () => {
    dispatch({ type: "RESET" });
    alert("초기화되었습니다");
  };

  return (
    <div>
      <input
        name="name"
        placeholder="이름"
        value={state.name}
        onChange={handleChange}  
      />
      <input
        name="email"
        placeholder="이메일"
        value={state.email}
        onChange={handleChange}  
      />
      <button onClick={handleReset}>초기화</button>
    </div>
  );
};

export default FormHandler;
