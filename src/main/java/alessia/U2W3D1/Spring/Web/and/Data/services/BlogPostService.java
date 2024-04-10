package alessia.U2W3D1.Spring.Web.and.Data.services;

import alessia.U2W3D2Compitopomeridiano.entities.BlogPost;
import alessia.U2W3D2Compitopomeridiano.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {
    private List<BlogPost> blogPostList = new ArrayList<>();

    public List<BlogPost> getBlogPostList(){
        return this.blogPostList;
    }

    public BlogPost saveBlogPost(BlogPost body){
        Random rndm = new Random();
        body.setId(rndm.nextInt(1,1000));
        this.blogPostList.add(body);
        return body;
    }

    public BlogPost findById(int id){
        BlogPost found = null;
        for (BlogPost blogPost : this.blogPostList){
            if (blogPost.getId() == id) found = blogPost;
        }
        if(found == null) throw new NotFoundException(id);
        else return found;
    }
    public BlogPost findByIdAndUpdate(int id, BlogPost updatedBlogPost){
        BlogPost found = null;
        for (BlogPost blogPost : this.blogPostList){
            if (blogPost.getId() == id) found = blogPost;
            found.setTitle(updatedBlogPost.getTitle());
            found.setCategory(updatedBlogPost.getCategory());
            found.setContent(updatedBlogPost.getContent());
            found.setReadingTime(updatedBlogPost.getReadingTime());
        }
        if(found == null) throw new NotFoundException(id);
        else return found;
    }

    public void findByIdAndDelete(int id){

        this.blogPostList.removeIf(current -> current.getId() == id);
    }

}
