package com.pluralsight.blog;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;

@Controller
public class BlogController {

	private PostRepository postRepository;

	@RequestMapping("/")
	public String listPosts(ModelMap modelMap) {
//		modelMap.put("title", "Blog Post 1");
		List<Post> posts = postRepository.getAllPosts();
		modelMap.put("posts", posts);
		return "home";
	}

	public BlogController(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	};

}
