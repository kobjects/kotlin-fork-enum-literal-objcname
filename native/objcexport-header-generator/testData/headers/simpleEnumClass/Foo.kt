import kotlin.native.ObjCName
import kotlin.experimental.ExperimentalObjCName

@file:OptIn(ExperimentalObjCEnum::class)

enum class Foo {
    A, @ObjCName("objcB") B, C
}