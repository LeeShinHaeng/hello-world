import React, { useState } from "react";

function InputCompare(props) {
  // 객체로 관리
  const [form, setForm] = useState({
    inputA: "",
    inputB: "",
  });

  const { inputA, inputB } = form;

  const onChange = (e) => {
    const nextForm = {
      ...form,
      [e.target.name]: e.target.value,
    };
    setForm(nextForm);
  };

  // 비교
  const onClick = (e) => {
    if (inputA === inputB) {
      alert("일치합니다.");
    } else {
      alert("일치하지 않습니다.");
    }
    // 비우기
    setForm({
      inputA: "",
      inputB: "",
    });
  };

  // 엔터 입력시
  const onKeyPress = (e) => {
    if (e.key === "Enter") onClick();
  };

  return (
    <div>
      <h2>두개의 입력값을 비교</h2>
      <input
        type="text"
        name="inputA"
        placeholder="입력1"
        value={inputA}
        onChange={onChange}
        onKeyUp={onKeyPress}
      />
      <input
        type="text"
        name="inputB"
        placeholder="입력2"
        value={inputB}
        onChange={onChange}
        onKeyUp={onKeyPress}
      />

      <button onClick={onClick}>확인</button>
    </div>
  );
}

export default InputCompare;
