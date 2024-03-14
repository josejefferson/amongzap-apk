{ pkgs, ... }: {
  channel = "stable-23.11";
  packages = [
    pkgs.flutter
    pkgs.jdk17
  ];
  idx.extensions = [
    "vscjava.vscode-java-pack"
    "redhat.vscode-xml"
    "vscjava.vscode-gradle"
  ];
  idx.previews = {
    previews = [
      {
        command = [
          "/bin/bash"
          ".idx/run.sh"
        ];
        id = "android";
        manager = "flutter";
      }
    ];
  };
}