import React from "react";
import "./Square.css";

// export default class Square extends React.Component {
const Square = ({onClick, value}) => {

    return (
        <button className="square" onClick={onClick}>
            {value}
        </button>
    )
}
export default Square