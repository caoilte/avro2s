/** GENERATED CODE */

package avro2s.test.logical

import org.apache.avro.AvroRuntimeException

import scala.annotation.switch

case class ComplexLogicalTypes(var _map: Map[String, java.util.UUID], var _array: List[java.time.LocalDate], var _union: Int | java.time.Instant, var _option: Option[java.util.UUID], var _map_union: Map[String, Int | java.time.Instant], var _map_array: Map[String, List[java.time.LocalDate]], var _union_map: Int | Map[String, java.util.UUID], var _union_array: Int | List[java.time.LocalDate], var _array_map: List[Map[String, java.util.UUID]], var _array_union: List[Int | java.time.Instant], var _array_option: List[Option[java.util.UUID]]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(Map.empty, List.empty, 0, None, Map.empty, Map.empty, 0, 0, List.empty, List.empty, List.empty)

  override def getSchema: org.apache.avro.Schema = ComplexLogicalTypes.SCHEMA$

  override def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
        _map.foreach { kvp =>
          val key = kvp._1
          val value = {
            {kvp._2.toString}
          }
          map.put(key, value)
        }
        map
      }.asInstanceOf[AnyRef]
      case 1 => _array match {
        case array =>
          scala.jdk.CollectionConverters.BufferHasAsJava({
            array.map { x =>
              {x.toEpochDay}.asInstanceOf[AnyRef]
            }
          }.toBuffer).asJava
        }
      case 2 => _union match {
        case x: Int => x.asInstanceOf[AnyRef]
        case x: java.time.Instant => {x.toEpochMilli}.asInstanceOf[AnyRef]
      }
      case 3 => _option match {
        case None => null
        case Some(x) => {x.toString}.asInstanceOf[AnyRef]
      }
      case 4 => {
        val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
        _map_union.foreach { kvp =>
          val key = kvp._1
          val value = {
            kvp._2 match {
              case x: Int => x.asInstanceOf[AnyRef]
              case x: java.time.Instant => {x.toEpochMilli}.asInstanceOf[AnyRef]
            }
          }
          map.put(key, value)
        }
        map
      }.asInstanceOf[AnyRef]
      case 5 => {
        val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
        _map_array.foreach { kvp =>
          val key = kvp._1
          val value = {
            scala.jdk.CollectionConverters.BufferHasAsJava({
              kvp._2.map { x =>
                {x.toEpochDay}.asInstanceOf[AnyRef]
              }
            }.toBuffer).asJava
          }
          map.put(key, value)
        }
        map
      }.asInstanceOf[AnyRef]
      case 6 => _union_map match {
        case x: Int => x.asInstanceOf[AnyRef]
        case x: Map[String, java.util.UUID] =>
          val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
          x.foreach { kvp =>
            val key = kvp._1
            val value = {
              {kvp._2.toString}
            }
            map.put(key, value)
          }
          map
      }
      case 7 => _union_array match {
        case x: Int => x.asInstanceOf[AnyRef]
        case x: List[java.time.LocalDate] =>
        scala.jdk.CollectionConverters.BufferHasAsJava({
          x.map { x =>{x.toEpochDay}.asInstanceOf[AnyRef]
          }
        }.toBuffer).asJava.asInstanceOf[AnyRef]
      }
      case 8 => _array_map match {
        case array =>
          scala.jdk.CollectionConverters.BufferHasAsJava({
            array.map { m =>
              val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
              m.foreach { kvp =>
                val key = kvp._1
                val value = {
                  {kvp._2.toString}
                }
                map.put(key, value)
              }
              map
            }
          }.toBuffer).asJava
        }
      case 9 => _array_union match {
        case array =>
          scala.jdk.CollectionConverters.BufferHasAsJava({
            array.map {
              case x: Int => x.asInstanceOf[AnyRef]
              case x: java.time.Instant => {x.toEpochMilli}.asInstanceOf[AnyRef]
            }
          }.toBuffer).asJava
        }
      case 10 => _array_option match {
        case array =>
          scala.jdk.CollectionConverters.BufferHasAsJava({
            array.map {
              case None => null
              case Some(x) => {x.toString}.asInstanceOf[AnyRef]
            }
          }.toBuffer).asJava
        }
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }

  override def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this._map = {
        value match {
          case map: java.util.Map[_,_] => {
            scala.jdk.CollectionConverters.MapHasAsScala(map).asScala.toMap map { kvp =>
              val key = kvp._1.toString
              val value = kvp._2
              (key, {
                {java.util.UUID.fromString(value.toString)}
              })
            }
          }
        }
      }
      case 1 => this._array = {
        value match {
          case array: java.util.List[_] =>
            scala.jdk.CollectionConverters.IteratorHasAsScala(array.iterator).asScala.map({ value =>
              {java.time.LocalDate.ofEpochDay(value.asInstanceOf[Int])}
            }).toList
          }
      }
      case 2 => value match {
        case x: Int => this._union = x
        case x: Long => this._union = {java.time.Instant.ofEpochMilli(x)}
        case _ => throw new AvroRuntimeException("Invalid value")
      }
      case 3 => value match {
        case null => this._option = None
        case x => this._option = Some({java.util.UUID.fromString(x.toString)}.asInstanceOf[java.util.UUID])
      }
      case 4 => this._map_union = {
        value match {
          case map: java.util.Map[_,_] => {
            scala.jdk.CollectionConverters.MapHasAsScala(map).asScala.toMap map { kvp =>
              val key = kvp._1.toString
              val value = kvp._2
              (key, {
                value match {
                  case x: Int => x
                  case x: Long => {java.time.Instant.ofEpochMilli(x)}
                  case _ => throw new AvroRuntimeException("Invalid value")
                }
              })
            }
          }
        }
      }
      case 5 => this._map_array = {
        value match {
          case map: java.util.Map[_,_] => {
            scala.jdk.CollectionConverters.MapHasAsScala(map).asScala.toMap map { kvp =>
              val key = kvp._1.toString
              val value = kvp._2
              (key, {
                value match {
                  case array: java.util.List[_] =>
                    scala.jdk.CollectionConverters.IteratorHasAsScala(array.iterator).asScala.map({ value =>
                      {java.time.LocalDate.ofEpochDay(value.asInstanceOf[Int])}
                    }).toList
                  }
              })
            }
          }
        }
      }
      case 6 => value match {
        case x: Int => this._union_map = x
        case map: java.util.Map[_,_] => this._union_map = {
          scala.jdk.CollectionConverters.MapHasAsScala(map).asScala.toMap map { kvp =>
            val key = kvp._1.toString
            val value = kvp._2
            (key, {
              {java.util.UUID.fromString(value.toString)}
            })
          }
        }
        case _ => throw new AvroRuntimeException("Invalid value")
      }
      case 7 => value match {
        case x: Int => this._union_array = x
        case x: java.util.List[_] => this._union_array = {
          x match {
            case array: java.util.List[_] =>
              scala.jdk.CollectionConverters.IteratorHasAsScala(array.iterator).asScala.map({ value =>
                {java.time.LocalDate.ofEpochDay(value.asInstanceOf[Int])}
              }).toList
            }
        }.toList
        case _ => throw new AvroRuntimeException("Invalid value")
      }
      case 8 => this._array_map = {
        value match {
          case array: java.util.List[_] =>
            scala.jdk.CollectionConverters.IteratorHasAsScala(array.iterator).asScala.map({ value =>
              value match {
                case map: java.util.Map[_,_] => {
                  scala.jdk.CollectionConverters.MapHasAsScala(map).asScala.toMap map { kvp =>
                    val key = kvp._1.toString
                    val value = kvp._2
                    (key, {
                      {java.util.UUID.fromString(value.toString)}
                    })
                  }
                }
              }
            }).toList
          }
      }
      case 9 => this._array_union = {
        value match {
          case array: java.util.List[_] =>
            scala.jdk.CollectionConverters.IteratorHasAsScala(array.iterator).asScala.map({ value =>
              value match {
                case x: Int => x
                case x: Long => {java.time.Instant.ofEpochMilli(x)}
                case _ => throw new AvroRuntimeException("Invalid value")
              }
            }).toList
          }
      }
      case 10 => this._array_option = {
        value match {
          case array: java.util.List[_] =>
            scala.jdk.CollectionConverters.IteratorHasAsScala(array.iterator).asScala.map({ value =>
              value match {
                case null => None
                case x => Some({java.util.UUID.fromString(x.toString)}.asInstanceOf[java.util.UUID])
              }
            }).toList
          }
      }
    }
  }
}

object ComplexLogicalTypes {
  val SCHEMA$: org.apache.avro.Schema = new org.apache.avro.Schema.Parser().parse("""{"type":"record","name":"ComplexLogicalTypes","namespace":"avro2s.test.logical","fields":[{"name":"_map","type":{"type":"map","values":{"type":"string","logicalType":"uuid"}}},{"name":"_array","type":{"type":"array","items":{"type":"int","logicalType":"date"}}},{"name":"_union","type":["int",{"type":"long","logicalType":"timestamp-millis"}]},{"name":"_option","type":["null",{"type":"string","logicalType":"uuid"}]},{"name":"_map_union","type":{"type":"map","values":["int",{"type":"long","logicalType":"timestamp-millis"}]}},{"name":"_map_array","type":{"type":"map","values":{"type":"array","items":{"type":"int","logicalType":"date"}}}},{"name":"_union_map","type":["int",{"type":"map","values":{"type":"string","logicalType":"uuid"}}]},{"name":"_union_array","type":["int",{"type":"array","items":{"type":"int","logicalType":"date"}}]},{"name":"_array_map","type":{"type":"array","items":{"type":"map","values":{"type":"string","logicalType":"uuid"}}}},{"name":"_array_union","type":{"type":"array","items":["int",{"type":"long","logicalType":"timestamp-millis"}]}},{"name":"_array_option","type":{"type":"array","items":["null",{"type":"string","logicalType":"uuid"}]}}]}""")
}