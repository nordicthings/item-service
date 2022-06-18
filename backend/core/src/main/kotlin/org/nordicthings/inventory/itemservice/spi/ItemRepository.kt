package org.nordicthings.inventory.itemservice.spi

import org.nordicthings.inventory.itemservice.domain.Item

interface ItemRepository {

    fun findById(id: String)
    fun findByName(pattern: String)
    fun findAll()
    fun save(item: Item)
    fun delete(item: Item)

}