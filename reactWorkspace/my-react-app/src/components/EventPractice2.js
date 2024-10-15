import React, { useState } from 'react';

// useState를 통해 문자열이 아닌 객체를 넣기 
function EventPractice2(props) {
    const [form, setForm] = useState({
        username: "",
        message: "",
    });

    const {username, message} = form;
    
    const onChange = (e) => {
        const nextForm = {
            ...form, // 기존 폼 내용 복사 후 
            [e.target.name]: e.target.value, // 원하는 값 덮어 씌우기 
        }
        setForm(nextForm);
    }
    const onClick = () => {
        alert(username + ": " + message);
        setForm({
            username: "",
            message: "",
        });
    };
    const onKeyPress = (e) => {
        if(e.key === "Enter") onClick()
    };

    return (
        <div>
            <h1>이벤트 연습</h1>
            <input type='text' name='username' placeholder='사용자명' 
            value={username} onChange={onChange}/>
            <input type='text' name='message' placeholder='메시지를 입력'
            value={message} onChange={onChange} 
            onKeyUp={onKeyPress}/>

            <button onClick={onClick} >확인</button>
        </div>
    );
}

export default EventPractice2;