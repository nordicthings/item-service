package org.nordicthings.inventory.itemservice.api.datatype

import java.util.*

@JvmInline
value class Id(val value: String = UUID.randomUUID().toString()) {
    companion object {
        val EMPTY = Id("")
    }
    override fun toString(): String = "'$value'"
}