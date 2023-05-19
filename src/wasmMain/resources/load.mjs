import { instantiate } from './Compose_Web_Wasm.uninstantiated.mjs';

await wasmSetup;
instantiate({ skia: Module['asm'] });