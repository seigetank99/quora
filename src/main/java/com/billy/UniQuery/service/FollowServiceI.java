package com.billy.UniQuery.service;

import com.billy.UniQuery.entity.User;

import java.util.List;

public interface FollowServiceI {

    List<User> listFollowers(int followerID);

    List<User> listFollowed(int followedID);

    int insertFollow(int followedID, int followerID);

}
