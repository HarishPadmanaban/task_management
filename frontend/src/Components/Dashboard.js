import React, { useEffect, useState } from "react";

export default function Dashboard() {
  const [employee, setEmployee] = useState(null);
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    const empData = localStorage.getItem("employee");
    const taskData = localStorage.getItem("tasks");

    if (empData) setEmployee(JSON.parse(empData));
    if (taskData) setTasks(JSON.parse(taskData));
  }, []);

  if (!employee) return <h2>No employee data found. Please login.</h2>;

  return (
    <div style={{ padding: "20px" }}>
      <h2>Welcome, {employee.name}</h2>
      <p>Email: {employee.email}</p>
      <p>Role: {employee.role}</p>

      <h3 style={{ marginTop: "20px" }}>Your Tasks:</h3>
      <ul>
        {tasks.length > 0 ? (
          tasks.map((task) => (
            <li key={task.id}>
              <strong>{task.title}</strong> - {task.status} (Due: {task.dueDate})
            </li>
          ))
        ) : (
          <p>No tasks assigned</p>
        )}
      </ul>
    </div>
  );
}
