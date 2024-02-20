package com.example.tp_blog.mapper;

import com.example.tp_blog.entities.Post;
import com.example.tp_blog.model.PostDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostMapper {

    @Mapping(source= "nom", target = "nom")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "contentPost", target = "contentPost")
    PostDTO postToPostDTO(Post post);

    @Mapping(source= "nom", target = "nom")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "contentPost", target = "contentPost")
    Post PostDtoToPost(PostDTO dto);


}
