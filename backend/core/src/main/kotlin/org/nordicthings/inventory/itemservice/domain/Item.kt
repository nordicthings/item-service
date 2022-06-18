package org.nordicthings.inventory.itemservice.domain

import org.apache.commons.lang3.builder.CompareToBuilder
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.nordicthings.inventory.itemservice.api.datatype.Id

data class Item(
    val id: Id = Id(),
    val name: String,
    var category: Category?) : Comparable<Item> {

    private val key = name.replace("""\s""", "").lowercase()

    override fun equals(other: Any?) = other != null && EqualsBuilder().append(key, (other as Item).key).isEquals

    override fun hashCode() = HashCodeBuilder().append(key).toHashCode()

    override fun compareTo(other: Item) = CompareToBuilder().append(key, (other as Item).key).toComparison()

}
