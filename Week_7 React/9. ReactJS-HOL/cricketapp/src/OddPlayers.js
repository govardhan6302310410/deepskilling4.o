import React from 'react';

const OddPlayers = ({ IndianTeam }) => {
  return (
    <ul>
      {IndianTeam.map((player, index) => (
        index % 2 === 0 ? <li key={index}> {["First", "Third", "Fifth"][index / 2]} : {player} </li> : null
      ))}
    </ul>
  );
};

export default OddPlayers;
