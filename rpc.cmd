protoc.exe -I=./lib -I=./protobuf/src -I=./protobuf/src/protocol --descriptor_set_out=rpc.schema.zip --java_out=./protobuf/target/generated_sources ./protobuf/src/protocol/rpc/rpc.proto
pause
rem https://plugins.jetbrains.com/plugin/10209-lsp-support/versions