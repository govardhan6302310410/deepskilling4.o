import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Virat', 'Rohit', 'Dhoni', 'Gill', 'Surya', 'Pant'];

  // Destructuring for Odd/Even
  const oddTeam = allPlayers.filter((_, i) => i % 2 !== 0);
  const evenTeam = allPlayers.filter((_, i) => i % 2 === 0);

  const T20players = ['Hardik', 'Jadeja'];
  const RanjiTrophy = ['Pujara', 'Rahane'];

  const mergedPlayers = [...T20players, ...RanjiTrophy]; // ES6 spread

  return (
    <div>
      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>Merged T20 + Ranji Trophy Players</h2>
      <ul>
        {mergedPlayers.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;

