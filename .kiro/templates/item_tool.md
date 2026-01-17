# ツール追加テンプレート

## 基本情報
```yaml
アイテムID: mythril_sword
アイテム名（日本語）: ミスリルの剣
アイテム名（英語）: Mythril Sword
```

## ツールタイプ
```yaml
ツールタイプ: 剣  # 剣/斧/ピッケル/シャベル/クワ
```

## ツール特性
```yaml
# 素材ティア設定
採掘レベル: 3  # 0=木, 1=石, 2=鉄, 3=ダイヤ, 4=ネザライト
耐久値: 1500
採掘速度: 8.0
攻撃力ボーナス: 3.0  # 基本攻撃力に加算される値
エンチャント適性: 14  # 高いほどエンチャントが良くなる

# 武器特性（剣/斧の場合）
攻撃力: 8.0  # 最終的な攻撃力
攻撃速度: -2.4  # 負の値が大きいほど遅い

# 採掘特性（ピッケル/シャベル/斧の場合）
適用ブロック: 全て  # または具体的なブロックタグ
```

## クリエイティブタブ
```yaml
タブ: 戦闘  # ツール/戦闘
```

## クラフトレシピ
```yaml
クラフトレシピ: あり
レシピタイプ: 作業台（有形）

# 剣のパターン例
パターン:
  行1: [air, mythril_ingot, air]
  行2: [air, mythril_ingot, air]
  行3: [air, stick, air]

# ピッケルのパターン例
# パターン:
#   行1: [mythril_ingot, mythril_ingot, mythril_ingot]
#   行2: [air, stick, air]
#   行3: [air, stick, air]

# 斧のパターン例
# パターン:
#   行1: [mythril_ingot, mythril_ingot, air]
#   行2: [mythril_ingot, stick, air]
#   行3: [air, stick, air]

# シャベルのパターン例
# パターン:
#   行1: [air, mythril_ingot, air]
#   行2: [air, stick, air]
#   行3: [air, stick, air]

# クワのパターン例
# パターン:
#   行1: [mythril_ingot, mythril_ingot, air]
#   行2: [air, stick, air]
#   行3: [air, stick, air]
```

## 修繕
```yaml
修繕可能: Yes
修繕材料: mythril_ingot
```

## テクスチャ
```yaml
テクスチャファイル名: mythril_sword.png
テクスチャサイズ: 16x16
3Dモデル: 通常  # 通常/カスタム（手持ち時の表示）
```

## 特殊機能（任意）
```yaml
特殊能力: なし
# 例: "攻撃時に雷を落とす"
右クリック動作: なし
# 例: "右クリックで範囲攻撃"
```

---

## AIへの指示
```
上記のツールアイテムを実装してください。

必要なファイル:
1. ツールティア定義クラス
2. ツールアイテムクラス
3. アイテム登録
4. アイテムモデルJSON（手持ち用）
5. 言語ファイル（ja_jp.json, en_us.json）
6. クラフトレシピJSON
7. 修繕レシピJSON（鍛冶台用）

プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
```
