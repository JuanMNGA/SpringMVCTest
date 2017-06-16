package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Channel;

@Repository("channelRepository")
public interface ChannelDao extends JpaRepository<Channel, Long> {
	 Channel findById(int id);
}
