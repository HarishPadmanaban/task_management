import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import "./App.css";
import Login from "./Components/Login.js";
import Signup from "./Components/Signup.js";
import Dashboard from "./Components/Dashboard.js";

export default function App() {
  return (
    <Router>
      <nav>
        <Link to="/">Login</Link>
        <Link to="/signup">Signup</Link>
      </nav>

      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/signup" element={<Signup />} />
        <Route path="/success" element={<Dashboard />} />
      </Routes>
    </Router>
  );
}