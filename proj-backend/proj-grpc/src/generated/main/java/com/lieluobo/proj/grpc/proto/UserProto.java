// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.lieluobo.proj.grpc.proto;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_AddUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_AddUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_AddUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_AddUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetAllUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetAllUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetAllUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetAllUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\004user\"\036\n\016AddUserRequest\022\014\n\004" +
      "name\030\001 \001(\t\"\021\n\017AddUserResponse\"\023\n\021GetAllU" +
      "serRequest\"/\n\022GetAllUserResponse\022\031\n\005user" +
      "s\030\001 \003(\0132\n.user.User\" \n\004User\022\n\n\002id\030\001 \001(\003\022" +
      "\014\n\004name\030\002 \001(\t2\202\001\n\013UserService\0224\n\003Add\022\024.u" +
      "ser.AddUserRequest\032\025.user.AddUserRespons" +
      "e\"\000\022=\n\006GetAll\022\027.user.GetAllUserRequest\032\030" +
      ".user.GetAllUserResponse\"\000B+\n\034com.lieluo" +
      "bo.proj.grpc.protoB\tUserProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_user_AddUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_AddUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_AddUserRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_user_AddUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_user_AddUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_AddUserResponse_descriptor,
        new java.lang.String[] { });
    internal_static_user_GetAllUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_user_GetAllUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetAllUserRequest_descriptor,
        new java.lang.String[] { });
    internal_static_user_GetAllUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_user_GetAllUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetAllUserResponse_descriptor,
        new java.lang.String[] { "Users", });
    internal_static_user_User_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_user_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_User_descriptor,
        new java.lang.String[] { "Id", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
