// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package br.com.demo;

public final class HelloServiceOuterClass {
  private HelloServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_demo_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_demo_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_demo_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_demo_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HelloService.proto\022\013br.com.demo\"3\n\014Hel" +
      "loRequest\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010lastName" +
      "\030\002 \001(\t\"!\n\rHelloResponse\022\020\n\010greeting\030\001 \001(" +
      "\t2N\n\014HelloService\022>\n\005hello\022\031.br.com.demo" +
      ".HelloRequest\032\032.br.com.demo.HelloRespons" +
      "eB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_br_com_demo_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_br_com_demo_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_demo_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_br_com_demo_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_br_com_demo_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_demo_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
