import React from 'react'
import './App.css';
import image from './logoicon.png';
function Header()
{
return(
  <div>
<header className="App-header">
<img src={image} height={100} width={100} />
<p>
  <marquee>
  *******List Of ALL Products*******
  </marquee>
</p>
<a
  className="App-link"
  href="https://reactjs.org"
  target="_blank"
  rel="noopener noreferrer"
>
  
</a>
</header>
</div>
);
}

export default Header
