import React from 'react';

const EvenPlayers = ({ IndianTeam }) => {
  return (
    <ul>
      {IndianTeam.map((player, index) => (
        index % 2 === 1 ? <li key={index}> {["Second", "Fourth", "Sixth"][(index - 1) / 2]} : {player} </li> : null
      ))}
    </ul>
  );
};

export default EvenPlayers;
