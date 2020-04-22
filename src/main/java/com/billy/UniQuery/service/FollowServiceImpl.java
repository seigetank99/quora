package com.billy.UniQuery.service;

import com.billy.UniQuery.entity.User;

import java.util.List;

/**
 * 〈〉
 *
 * @author Billy Yan
 * @create 4/17/2020
 * @since 1.0.0
 */
public class FollowServiceImpl implements FollowServiceI {

    @Override
    public List<User> listFollowers(int followerID) {
        return null;
    }

    @Override
    public List<User> listFollowed(int followedID) {
        return null;
    }

    @Override
    public int insertFollow(int followedID, int followerID) {
        return 0;
    }
}
