import React, { useState } from "react";

function RandomNumber(props) {
  const [count, setCount] = useState(0);
  const generate = () => {
    return Math.floor(Math.random() * 100) + 1; // 1부터 100까지의 랜덤 정수 생성
  };
  return (
    <div className="random-number-container">
      <button onClick={() => setCount(generate)}>클릭</button>
      <h3>랜덤 수: {count}</h3>
    </div>
  );
}

export default RandomNumber;
