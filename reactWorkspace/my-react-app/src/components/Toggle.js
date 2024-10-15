import React, { useState } from 'react';

function Toggle(props) {
    const [isOn, setIsOn] = useState(true);

    const toggle = () => setIsOn(!isOn)

    return (
        <div>
            <h2>토글 버튼</h2>
            <button onClick={toggle}>
                {isOn ? '켜짐' : '꺼짐'}
            </button>
        </div>
    );
}

export default Toggle;