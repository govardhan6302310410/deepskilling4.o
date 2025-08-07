import './App.css';

function App() {
  const courses = [
    { id: 1, name: "Angular", date: "4/5/2021" },
    { id: 2, name: "React", date: "6/3/2021" }
  ];

  const books = [
    { id: 1, bname: "Master React", price: 670 },
    { id: 2, bname: "Deep Dive into Angular 11", price: 800 },
    { id: 3, bname: "Mongo Essentials", price: 450 }
  ];

  const blog = {
    title: "React Learning",
    author: "Stephen Biz",
    intro: "Welcome to learning React!",
    install: "You can install React from npm.",
    tool: "Schwezendier"
  };

  return (
    <div className="container">
      <div className="section">
        <h2>Course Details</h2>
        {courses.map(course => (
          <div key={course.id}>
            <h3>{course.name}</h3>
            <p>{course.date}</p>
          </div>
        ))}
      </div>

      <div className="section">
        <h2>Book Details</h2>
        {books.map(book => (
          <div key={book.id}>
            <h3>{book.bname}</h3>
            <h4>{book.price}</h4>
          </div>
        ))}
      </div>

      <div className="section">
        <h2>Blog Details</h2>
        <h3>{blog.title}</h3>
        <p><strong>{blog.author}</strong></p>
        <p>{blog.intro}</p>
        <h3>Installation</h3>
        <p><strong>{blog.tool}</strong></p>
        <p>{blog.install}</p>
      </div>
    </div>
  );
}

export default App;