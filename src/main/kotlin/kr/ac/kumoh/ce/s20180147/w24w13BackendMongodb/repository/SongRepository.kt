package kr.ac.kumoh.ce.s20180147.w24w13BackendMongodb.repository

import kr.ac.kumoh.ce.s20180147.w24w13BackendMongodb.model.Song
import org.springframework.data.mongodb.repository.MongoRepository

interface SongRepository : MongoRepository<Song,String> {

  fun findBySinger(singer: String): List<Song>
}