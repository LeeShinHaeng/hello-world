import React, { useEffect, useReducer, useState } from "react";
import useInputs from "./UseInput";

const Info = () => {
  const [state, onChange] = useInputs({
    name: "",
    nickname: "",
  });
  const { name, nickname } = state;

  useEffect(() => {
    console.log("랜더링이 완료되었습니다!");
    return () => {
      console.log("unmount");
    };
  }, []);

  return (
    <div>
      <div>
        <input name="name" value={name} onChange={onChange} />
        <input name="nickname" value={nickname} onChange={onChange} />
      </div>
      <div>
        <div>이름: {name}</div>
        <div>닉네임: {nickname}</div>
      </div>
    </div>
  );
};

export default Info;
