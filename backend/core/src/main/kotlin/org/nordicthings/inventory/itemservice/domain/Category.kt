package org.nordicthings.inventory.itemservice.domain

import org.apache.commons.lang3.builder.CompareToBuilder
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.nordicthings.inventory.itemservice.api.datatype.Id

data class Category(val id: Id, val key: String, val name: String) : Comparable<Category> {

    override fun hashCode() = HashCodeBuilder().append(key).toHashCode()

    override fun equals(other: Any?): Boolean {
        return EqualsBuilder().append(this.key, (other as Category).key).isEquals
    }

    override fun compareTo(other: Category): Int {
        return CompareToBuilder().append(this.key, other.key).toComparison()
    }

}