package com.example.tibiarank.database.model

import com.google.gson.annotations.SerializedName

data class ItemsResponse(

	@field:SerializedName("templateType")
	val templateType: String? = null,

	@field:SerializedName("stackable")
	val stackable: String? = null,

	@field:SerializedName("npcprice")
	val npcprice: String? = null,

	@field:SerializedName("plural")
	val plural: String? = null,

	@field:SerializedName("notes")
	val notes: String? = null,

	@field:SerializedName("primarytype")
	val primarytype: String? = null,

	@field:SerializedName("walkable")
	val walkable: String? = null,

	@field:SerializedName("npcvalue")
	val npcvalue: String? = null,

	@field:SerializedName("weight")
	val weight: String? = null,

	@field:SerializedName("marketable")
	val marketable: String? = null,

	@field:SerializedName("immobile")
	val immobile: String? = null,

	@field:SerializedName("sprites")
	val sprites: String? = null,

	@field:SerializedName("objectclass")
	val objectclass: String? = null,

	@field:SerializedName("article")
	val article: String? = null,

	@field:SerializedName("actualname")
	val actualname: String? = null,

	@field:SerializedName("imbuements")
	val imbuements: String? = null,

	@field:SerializedName("itemid")
	val itemid: List<String?>? = null,

	@field:SerializedName("buyfrom")
	val buyfrom: String? = null,

	@field:SerializedName("sellto")
	val sellto: String? = null,

	@field:SerializedName("pickupable")
	val pickupable: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("implemented")
	val implemented: String? = null,

	@field:SerializedName("droppedby")
	val droppedby: List<String?>? = null,

	@field:SerializedName("value")
	val value: String? = null
)
