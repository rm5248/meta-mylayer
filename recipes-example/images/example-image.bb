require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "example-binary"

TOOLCHAIN_TARGET_TASK += " example-binary-dev"
