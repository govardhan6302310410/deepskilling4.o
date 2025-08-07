import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [euro, setEuro] = useState('');
  const [rupees, setRupees] = useState('');

  const handleSubmit = () => {
    const converted = (parseFloat(euro) * 90).toFixed(2); // ₹90 = €1 (example rate)
    alert(`Converting to Rupees: ₹${converted}`);
    setRupees(converted);
  };

  return (
    <div>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
      <label>Amount: </label>
      <input
        type="number"
        value={euro}
        onChange={(e) => setEuro(e.target.value)}
        placeholder="Enter Euros"
      /><br /><br />
      <label>Currency: </label>
      <input type="text" value={rupees} readOnly />
      <br /><br />
      <button onClick={handleSubmit}>Submit</button>
    </div>
  );
};

export default CurrencyConvertor;
