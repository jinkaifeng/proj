package com.lieluobo.proj.common.utils

import com.google.gson.*
import java.lang.reflect.Type
import java.text.DateFormat
import java.util.*


object GsonBuilderUtil {
    val instance = GsonBuilder()
            .registerTypeAdapter(java.util.Date::class.java, DateSerializer()).setDateFormat(DateFormat.LONG)
            .registerTypeAdapter(java.util.Date::class.java, DateDeserializer()).setDateFormat(DateFormat.LONG)
            .create()!!
}


class DateSerializer : JsonSerializer<Date> {
    override fun serialize(src: Date, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        return JsonPrimitive(src.time)
    }
}

class DateDeserializer : JsonDeserializer<Date> {
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): Date {
        return java.util.Date(json.asJsonPrimitive.asLong)
    }
}