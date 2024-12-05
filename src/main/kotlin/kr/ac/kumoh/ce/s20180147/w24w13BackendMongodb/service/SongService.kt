package kr.ac.kumoh.ce.s20180147.w24w13BackendMongodb.service

import kr.ac.kumoh.ce.s20180147.w24w13BackendMongodb.model.Song
import kr.ac.kumoh.ce.s20180147.w24w13BackendMongodb.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(private val repository: SongRepository) {
  fun getAllSongs(): List<Song> = repository.findAll()
}