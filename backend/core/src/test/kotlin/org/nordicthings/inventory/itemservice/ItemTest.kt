package org.nordicthings.inventory.itemservice

import org.junit.jupiter.api.Test
import org.nordicthings.inventory.itemservice.api.datatype.Id
import org.nordicthings.inventory.itemservice.domain.Item

class ItemTest() {
    private val orgItem = Item(Id(), "anyName1", null)
    private val equalItem = Item(Id(), "AnyName1", null)
    private val anotherEqualItem = Item(Id(), "any Name 1", null)
    private val notEqualItem = Item(Id(), "anotherName", null)
    private val precedingItem = Item(Id(), "anyName0", null)
    private val followingItem = Item(Id(), "anyName2", null)

    private val helper: DomainTestHelper = DomainTestHelper()

    @Test
    fun checkHashCodeEquals() {
        helper.checkEqualsContract(orgItem, equalItem, anotherEqualItem, notEqualItem)
        helper.checkHashCodeContract(orgItem, equalItem)
    }

    @Test
    fun checkComparable() {
        helper.checkComparableToContract(orgItem, equalItem, precedingItem, followingItem)
        helper.checkComparableToConsistence(orgItem, equalItem)
    }
}