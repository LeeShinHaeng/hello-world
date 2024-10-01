import React from "react";

function JSXPractice() {
  const name = "React Learner";
  const isLoggedIn = true;
  const numbers = [1, 2, 3, 4, 5];

  function handleClick(){
    alert("Button clicked")
  }

  function getGreeting(user){
    if(user) {
        return <h2>Hello {user}</h2>
    }
    return <h2>Hello Stranger</h2>
  }

  return (
    <div>
      <h1>JSX 실습</h1>
      <p>Welcome, {name}</p>
      {isLoggedIn ? <p> 로그인 완료 </p> : <p> 로그인 해주세요 </p>}

      <ul>
        {numbers.map((number) => (
          <li key={number}>{number}</li>
        ))}
      </ul>

      <button onClick={handleClick}>Click me</button>

      {getGreeting("JSX Learner")}

      <h1>{'<script>alert("Hacked!")</script>'}</h1>
    </div>
  );
}

export default JSXPractice;
