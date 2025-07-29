import React from 'react';
import CohortDetails from './Components/CohortDetails';

const cohorts = [
  {
    name: 'React Basics',
    status: 'ongoing',
    startDate: '2025-07-01',
    endDate: '2025-08-01',
  },
  {
    name: 'Node.js Advanced',
    status: 'completed',
    startDate: '2025-05-01',
    endDate: '2025-06-15',
  },
];

function App() {
  return (
    <div style={{ padding: '20px' }}>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
