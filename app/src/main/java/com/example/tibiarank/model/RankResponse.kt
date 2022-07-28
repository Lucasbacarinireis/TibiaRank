package com.example.tibiarank.model

import com.google.gson.annotations.SerializedName

data class RankResponse(

	@field:SerializedName("information")
	val information: Information? = null,

	@field:SerializedName("highscores")
	val highscores: Highscores? = null
)

data class HighscoreListItem(

	@field:SerializedName("vocation")
	val vocation: String? = null,

	@field:SerializedName("world")
	val world: String? = null,

	@field:SerializedName("level")
	val level: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("rank")
	val rank: Int? = null,

	@field:SerializedName("value")
	val value: Long? = null
)

data class Highscores(

	@field:SerializedName("vocation")
	val vocation: String? = null,

	@field:SerializedName("world")
	val world: String? = null,

	@field:SerializedName("highscore_list")
	val highscoreList: List<HighscoreListItem>? = null,

	@field:SerializedName("highscore_age")
	val highscoreAge: Int? = null,

	@field:SerializedName("category")
	val category: String? = null
)

data class Information(

	@field:SerializedName("api_version")
	val apiVersion: Int? = null,

	@field:SerializedName("timestamp")
	val timestamp: String? = null
)
