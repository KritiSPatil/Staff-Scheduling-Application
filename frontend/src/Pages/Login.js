import React, { useState } from 'react';
import '../Assets/Login.css';
import { useNavigate } from 'react-router-dom';

function Login() {
  const [formData, setFormData] = useState({
    username: '',
    email: '',
    password: '',
  });

  const [allFieldsError, setAllFieldsError] = useState('');
  const nav = useNavigate();

  const validateForm = () => {
    if (!formData.username || !formData.email || !formData.password) {
      setAllFieldsError('All fields are required');
      return false;
    }
    return true;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validateForm()) {
      // Bypass authentication and navigate to TimingsTable
      nav('/timings');
    }
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
    setAllFieldsError('');
  };

  return (
    <div className="loginbody">
      <div className="form-wrapper">
        <h1>Sign In</h1>
        <form onSubmit={handleSubmit}>
          <div className="form-item">
            <label htmlFor="username">Username:</label>
            <input
              type="text"
              name="username"
              value={formData.username}
              onChange={handleChange}
              required
            />
          </div>
          <br />
          <div className="form-item">
            <label htmlFor="email">Email:</label>
            <input
              type="email"
              name="email"
              value={formData.email}
              onChange={handleChange}
              required
            />
          </div>
          <br />
          <div className="form-item">
            <label htmlFor="password">Password:</label>
            <input
              type="password"
              name="password"
              value={formData.password}
              onChange={handleChange}
              required
            />
          </div>
          {allFieldsError && <div className="error-message">{allFieldsError}</div>}
          <div className="button-panel">
            <input type="submit" className="button" title="Sign In" value="Sign In" />
          </div>
        </form>
      </div>
    </div>
  );
}

export default Login;