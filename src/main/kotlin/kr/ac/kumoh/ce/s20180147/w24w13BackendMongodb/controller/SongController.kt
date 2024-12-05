package kr.ac.kumoh.ce.s20180147.w24w13BackendMongodb.controller

import kr.ac.kumoh.ce.s20180147.w24w13BackendMongodb.model.Song
import kr.ac.kumoh.ce.s20180147.w24w13BackendMongodb.service.SongService
import org.springframework.web.bind.annotation.*

@RestController
class SongController(private val service: SongService) {
  @GetMapping("/api/songs")
  fun getAllSongs(): List<Song> = service.getAllSongs()
}