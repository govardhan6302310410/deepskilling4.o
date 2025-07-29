// src/Posts.js
import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  // Fetch API data
  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((res) => res.json())
      .then((data) => {
        this.setState({ posts: data });
      })
      .catch((error) => {
        console.error("Error fetching posts:", error);
        this.setState({ hasError: true });
      });
  }

  // Lifecycle hook to load data
  componentDidMount() {
    this.loadPosts();
  }

  // Catch rendering errors
  componentDidCatch(error, info) {
    alert("An error occurred: " + error.toString());
    this.setState({ hasError: true });
  }

  render() {
    if (this.state.hasError) {
      return <h2>Something went wrong while loading posts.</h2>;
    }

    return (
      <div>
        <h2>Posts</h2>
        {this.state.posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
