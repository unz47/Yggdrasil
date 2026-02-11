# アダマンタイト鉱石追加要件

## 基本情報
```yaml
ブロックID: adamantite_ore
ブロック名（日本語）: アダマンタイト鉱石
ブロック名（英語）: Adamantite Ore
説明: アダマンタイトを含む鉱石
```

## ブロック特性
```yaml
硬度: 5.0
爆破耐性: 4.0
採掘レベル: ダイヤモンドツール以上
適正ツール: ツルハシ
音: 石
発光レベル: 9
```

## クリエイティブタブ
```yaml
タブ: Yggdrasil_ブロック
```

## ドロップ
```yaml
シルクタッチなし: adamantite_ore x 1
シルクタッチあり: adamantite_ore x 1
経験値: 0-3
```

## 精錬
```yaml
かまど: adamantite_nugget x 1 (経験値 1.0)
溶鉱炉: adamantite_nugget x 1 (経験値 1.0、時間半分)
```

## テクスチャ
```yaml
テクスチャファイル名: adamantite_ore.png
テクスチャパス: textures/block/adamantite_ore.png
テクスチャサイズ: 16x16
```

## 生成設定
```yaml
ワールド生成: あり
生成バイオーム: 全バイオーム
生成高度: Y=-64 ~ Y=4
鉱脈サイズ: 1-3ブロック
チャンクあたり: 3鉱脈
生成確率: 極低（ダイヤモンドより希少）
```

## 入手方法
```yaml
入手方法:
  - 採掘: Yes
  - クラフト: なし
  - モブドロップ: なし
  - チェスト戦利品: なし
```

---

## 実装指示

上記のアダマンタイト鉱石を実装してください。

必要なファイル:
1. block/ModBlocks.java - ブロック登録
2. ModCreativeTabs.java - ブロックタブに追加
3. assets/yggdrasil/blockstates/adamantite_ore.json
4. assets/yggdrasil/models/block/adamantite_ore.json
5. assets/yggdrasil/models/item/adamantite_ore.json
6. assets/yggdrasil/textures/block/adamantite_ore.png
7. assets/yggdrasil/lang/ja_jp.json, en_us.json（翻訳追加）
8. data/yggdrasil/loot_tables/blocks/adamantite_ore.json
9. data/minecraft/tags/blocks/mineable/pickaxe.json
10. data/minecraft/tags/blocks/needs_netherite_tool.json（カスタムタグ）
11. data/yggdrasil/recipes/metal/adamantite_nugget_from_ore_smelting.json
12. data/yggdrasil/recipes/metal/adamantite_nugget_from_ore_blasting.json
13. data/yggdrasil/worldgen/configured_feature/adamantite_ore.json
14. data/yggdrasil/worldgen/placed_feature/adamantite_ore.json
15. data/yggdrasil/forge/biome_modifier/add_adamantite_ore.json

前提: adamantite_nuggetが既に実装済み
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
